import telegram
from telegram.ext import Updater, CommandHandler, MessageHandler, Filters
from reportlab.pdfgen import canvas
from io import BytesIO

# Replace YOUR_BOT_TOKEN with your own bot token obtained from BotFather
bot = telegram.Bot(token='Y6298232020:AAHVOyI-56l0msTG66NpbBfheIbJrdpulJE')

# Define a dictionary to store the feedback
feedback_dict = {}


# Define a function to handle the /start command
def start(update, context):
    context.bot.send_message(chat_id=update.effective_chat.id,
                             text="Welcome to the feedback bot! Please send in your feedback.")


# Define a function to handle user feedback
def collect_feedback(update, context):
    # Get the user feedback
    feedback = update.message.text
    user_id = update.message.from_user.id
    username = update.message.from_user.username

    # Store the feedback in the dictionary
    if user_id not in feedback_dict:
        feedback_dict[user_id] = {'username': username, 'feedback': feedback}
    else:
        feedback_dict[user_id]['feedback'] = feedback

    context.bot.send_message(chat_id=update.effective_chat.id, text="Thank you for your feedback!")


# Define a function to handle the /report command
def generate_report(update, context):
    # Generate the PDF report
    packet = BytesIO()
    pdf_canvas = canvas.Canvas(packet)
    pdf_canvas.drawString(100, 750, "Feedback Report\n\n")
    for user_id, feedback in feedback_dict.items():
        pdf_canvas.drawString(100, 700 - (user_id * 50), f"{feedback['username']}: {feedback['feedback']}")
    pdf_canvas.save()
    packet.seek(0)

    # Send the PDF report to the group
    context.bot.send_document(chat_id=update.effective_chat.id, document=packet, filename='feedback_report.pdf')


# Create an Updater object and attach the handlers
updater = Updater(token='6298232020:AAHVOyI-56l0msTG66NpbBfheIbJrdpulJE', use_context=True)
dispatcher = updater.dispatcher
dispatcher.add_handler(CommandHandler('start', start))
dispatcher.add_handler(MessageHandler(Filters.text & ~Filters.command, collect_feedback))
dispatcher.add_handler(CommandHandler('report', generate_report))

# Start the bot
updater.start_polling()
