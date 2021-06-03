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


public class gradeCalculator extends ListenerAdapter {
	
    public void onMessageReceived(MessageReceivedEvent event)
    {
    	Message msg = event.getMessage();
		MessageChannel tc = msg.getChannel();
		String[] msgArray = msg.getContentRaw().split(" ");
		
		String msgSingle = msg.getContentRaw().toLowerCase();
		String msgSingleCase = msg.getContentRaw();
		
		String[] category = new String[10];
		double[] grade = new double[10];
		double[] weight = new double[10];
		
		//!jerm grades homework 20 30 final 30 40 
		if(msgSingle.toLowerCase().contentEquals("!jerm grades"))
		{
			tc.sendMessage("calculate your grade average in a class").queue();
			tc.sendMessage("do this: !jerm grades <category> <grade> <weight> ... (same parameters)").queue();
			tc.sendMessage(Integer.toString(msgArray.length)).queue();
		}
		
		else if ((msgSingle.toLowerCase().startsWith("!jerm grades")) && ((msgArray.length - 2) % 3 == 0)) {
			tc.sendMessage("entered it right").queue();
			
			int numClass = 0;
			
			
		}
		
		else if ((msgSingle.toLowerCase().startsWith("!jerm grades")) && ((msgArray.length - 2) % 3 != 0)){
			tc.sendMessage("you entered it wrong dingdong").queue();
		}
				
		
		
		
    }
}
	
	
