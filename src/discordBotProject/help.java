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


public class help extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event)
    {
    	Message msg = event.getMessage();
		MessageChannel tc = msg.getChannel();
		String[] msgArray = msg.getContentRaw().split(" ");
		
		String msgSingle = msg.getContentRaw().toLowerCase();
		String msgSingleCase = msg.getContentRaw();
        
        if(msgSingle.equals("!jerm help") || msgSingle.equals("!jerm commands"))
        {
        	EmbedBuilder eb = new EmbedBuilder();
        	
        	eb.setTitle("here are the funni jerm commands");
        	eb.setDescription("!jerm bored: this will tell you to stop being bored"
        			+ "\n!jerm pummel: my answer when ryan asks for pummel"
        			+ "\n!jerm amijerm: checks if you're the baws or not"
        			+ "\n!jerm smashwalvin: do you wanna play smash w alvin"
        			+ "\n!jerm dexter: shows a random pic of dexter da dawg"
        			+ "\n!jerm slot: play the slot machine");
        	eb.setAuthor("JermBot the King", null, "https://i.postimg.cc/qgVdG8bf/123719974-1550707321796018-2539704576434583032-n.png");
        	tc.sendMessage(eb.build()).queue();
        }
    }
	
	
}
