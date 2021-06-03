package discordBotProject;


import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.EmbedBuilder;
import java.util.Random;


public class slot extends ListenerAdapter {
	
	public void wait(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

    public void onMessageReceived(MessageReceivedEvent event)
    {
    	Message msg = event.getMessage();
		MessageChannel tc = msg.getChannel();
		String[] msgArray = msg.getContentRaw().split(" ");
		
		String msgSingle = msg.getContentRaw().toLowerCase();
		String msgSingleCase = msg.getContentRaw();
        
        if(msgSingle.equals("slot pls") ||msgSingle.equals("!jerm slot"))
        {
        	//making the randoms
        	
        	Random rd = new Random();
        	int num1 = rd.nextInt(3) + 1;
        	int num2 = rd.nextInt(3) + 1;
        	int num3 = rd.nextInt(3) + 1;
        	
        	String str1 = "";
        	String str2 = "";
        	String str3 = "";
        	
        	
        	switch (num1)
        	{
        	case 1: 
        		str1 = ":apple: ";
        		break;
        	case 2:
        		str1 = ":banana: ";
        		break;
        	case 3:
        		str1 = ":watermelon:";
        		break;
        	}
        	
        	switch (num2)
        	{
        	case 1: 
        		str2 = ":apple: ";
        		break;
        	case 2:
        		str2 = ":banana: ";
        		break;
        	case 3:
        		str2 = ":watermelon:";
        		break;
        	}
        	
        	switch (num3)
        	{
        	case 1: 
        		str3 = ":apple: ";
        		break;
        	case 2:
        		str3 = ":banana: ";
        		break;
        	case 3:
        		str3 = ":watermelon:";
        		break;
        	}
        	
        	String strFinal = str1 + str2 + str3;
        	tc.sendMessage("Rolling...").queue(roll -> {
        		roll.editMessage(":apple: :apple: :apple:").queue();
        		roll.editMessage(":banana: :banana: :banana:").queue();
        		roll.editMessage(":watermelon: :watermelon: :watermelon:").queue();
        		roll.editMessage(strFinal).queue();
        		
        		wait(3000);
        		if (num1 == num2 && num2 == num3) {
            		tc.sendMessage("GOOD SHIT - sheesh you are a winner tonite").queue();
            	}
            	else
            		tc.sendMessage("YOU LOST - bruh u suck").queue();
            });
        		
        	
        }
        
    }
	
	
}
