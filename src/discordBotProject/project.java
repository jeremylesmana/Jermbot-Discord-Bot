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
import java.io.File;


public class project extends ListenerAdapter {
	public static void main(String[] args) throws LoginException {
		JDA jda = JDABuilder.createDefault("ODQ1MTExNjMxMzAyMDk4OTQ1.YKcNig.ZvuTHM_JkboBPmHddBpphfz-DGo")
				.addEventListeners(new project())
				.addEventListeners(new dexter())
				.addEventListeners(new slot())
				.addEventListeners(new help())
				.addEventListeners(new gradeCalculator())
				.build();
		jda.getPresence().setActivity(Activity.watching("jerm be funni"));
		
		
	}
	
	@Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
		Message msg = event.getMessage();
		MessageChannel tc = msg.getChannel();
		String[] msgArray = msg.getContentRaw().split(" ");
		
		String msgSingle = msg.getContentRaw().toLowerCase();
		String msgSingleCase = msg.getContentRaw();
		
		//im bored events
        
        if (msgSingle.equals("jermbot im bored") || msgSingle.equals("!jerm bored"))
        {
        	tc.sendMessage("stop being so bored").queue();
        	System.out.println(event.getAuthor().toString());
        	System.out.println(event.getAuthor().getId());
        }
        
        
        //pummel party
        if(msgSingle.equals("pummel party") || msgSingle.equals("!jerm pummel"))
        {
        	tc.sendMessage("stfu ryan").queue();
        }
        
        if(msgSingle.equals("am i jerm") || msgSingle.equals("!jerm amijerm"))
        {
        	if(event.getAuthor().getId().equals("151584895653773312"))
        		tc.sendMessage("ye u chillin master sifu").queue();
        	else
        		tc.sendMessage("nah u impostor gtfo").queue();
        }
        
        //smash w alvin
        if(msgSingle.equals("smash w alvin") || msgSingle.equals("!jerm smashwalvin"))
        {
        	EmbedBuilder smashpic = new EmbedBuilder();
        	smashpic.setImage("https://i.imgur.com/QFzrRvi.png");
        	smashpic.setTitle("nah or else this happens to you");
        	tc.sendMessage(smashpic.build()).queue();
        }
    }
	
	
}
