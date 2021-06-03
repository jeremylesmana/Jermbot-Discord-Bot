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


public class dexter extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event)
    {
    	Message msg = event.getMessage();
		MessageChannel tc = msg.getChannel();
		String[] msgArray = msg.getContentRaw().split(" ");
		
		String msgSingle = msg.getContentRaw().toLowerCase();
		String msgSingleCase = msg.getContentRaw();
        //Dexter Functionalities
        if (msgSingle.equals("give me dexter") || msgSingle.equals("!jerm dexter"))
        {

        	Random rd = new Random();
        	int rdv = rd.nextInt(10) + 1;
        	EmbedBuilder eb = new EmbedBuilder();
        	
        	switch(rdv) {
        	
        	case 1: 
        		eb.setTitle("hiding dexter");
        		eb.setImage("https://i.imgur.com/AWO8yo5.png");
        		eb.setDescription("dexter so scared thats why he under chair");
        		break;
        	case 2:
        		eb.setTitle("dexter make frens");
        		eb.setImage("https://i.imgur.com/wFbh4Gg.png");
        		eb.setDescription("dexter see other corgi so they make frens?");
        		break;
        	
        	case 3:
        		eb.setTitle("dexter scared again");
        		eb.setImage("https://i.imgur.com/iNA7saE.png");
        		eb.setDescription("dexter veri scared again but this time there is white wire in front xd");
        		break;
        	case 4:
        		eb.setTitle("dexter observing da road");
        		eb.setImage("https://i.imgur.com/0w21Ang.png");
        		eb.setDescription("dexter payin attention to da traffic");
        		break;	
        	case 5:
        		eb.setTitle("dexter sleep disturbed");
        		eb.setImage("https://i.imgur.com/q6UHoza.jpg");
        		eb.setDescription("dexter askin why dafuq u disturb his sleep");
        		break;
        	case 6:
        		eb.setTitle("dexter ready for walk");
        		eb.setImage("https://i.imgur.com/SrBxuOC.png");
        		eb.setDescription("dexter ready to take a long overdue walk");
        		break;
        	case 7:
        		eb.setTitle("dexter much thirst");
        		eb.setImage("https://i.imgur.com/CmhCzY0.jpg");
        		eb.setDescription("dexter in da car but he thirsty for sum water");
        		break;
        	case 8:
        		eb.setTitle("dexter at beach with sifu jerm");
        		eb.setImage("https://i.imgur.com/xxufQNr.png");
        		eb.setDescription("dexter at da beach with CS major jermi boi");
        		break;
        	case 9:
        		eb.setTitle("dexter straight chillin");
        		eb.setImage("https://i.imgur.com/e1OKvBr.png");
        		eb.setDescription("dexter chillin in the sun like a villain");
        		break;
        	case 10:
        		eb.setTitle("dexter detect he nearby da vet");
        		eb.setImage("https://i.imgur.com/uwHnoyc.jpg");
        		eb.setDescription("dexter nearby da vet so mucho traumatize");
        		break;
        	}
        	eb.setAuthor("dexter da corgi",null,"https://i.imgur.com/0w21Ang.png");
        	eb.setFooter("dexter is anne's dog btw");
        	tc.sendMessage(eb.build()).queue();
        	
        }
    }
	
	
}
