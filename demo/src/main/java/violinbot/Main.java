package violinbot;

import java.util.List;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.request.ChatAction;
import com.pengrad.telegrambot.request.SendChatAction;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.BaseResponse;
import com.pengrad.telegrambot.response.SendResponse;

public class Main {
    
    public static void main(String[] args) {
        
       TelegramBot bot = new TelegramBot("6705746603:AAEvHJ4nPwhWkEUI7PjWc3CNOee-QBnuVbg");

        

        bot.setUpdatesListener(new UpdatesListener() {

           
            @Override
            public int process(List<Update> updates) {
               
                              
                for(Update update : updates){
                    String command = update.message().text();
                    Long chatId = update.message().chat().id();
                    BaseResponse baseResponse;
                    SendResponse sendResponse;

                    switch (command){
                        case "/nome":
                            baseResponse = bot.execute(new SendChatAction(chatId,ChatAction.typing));
                            sendResponse =  bot.execute(new SendMessage(chatId,update.message().from().firstName()));
                            break;
                        case "/sobrenome":
                        baseResponse = bot.execute(new SendChatAction(chatId,ChatAction.typing));
                        sendResponse = bot.execute(new SendMessage(chatId,update.message().from().lastName()));
                        break;
                        default:
                            baseResponse = bot.execute(new SendChatAction(chatId,ChatAction.typing));
                            sendResponse = bot.execute(new SendMessage(chatId,"Não entendi por favor use um comando"));
                            break;
                    }
                }
                return UpdatesListener.CONFIRMED_UPDATES_ALL;
            }
        });
    
  }
}