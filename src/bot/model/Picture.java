package bot.model;

import com.Cardinal.CommandPackage.Commands.ICommand;
import com.Cardinal.CommandPackage.Exceptions.MissingArgumentsException;

import bot.controller.BotController;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;
import sx.blah.discord.util.MissingPermissionsException;


// This class sends a link to a photo.
public class Picture implements ICommand 
{
	private BotController botControl;
	
	public Picture()
	{
		botControl = new BotController();
	}

	@Override
	public void execute(MessageReceivedEvent event, String[] args)
	{
		if (args[0].toLowerCase().equals("picture"))
		{
			switch(args[1].toLowerCase())
			{
			case "shield":
				botControl.messageSend("https://lh3.googleusercontent.com/-Cm5o99Hc_2k/WhnenIiMhVI/AAAAAAAAS-s/m3_x74TPDoQWgaHMRSAVdVfDTUYW6mrTACJoC/w506-h750/image%252520%252866%2529.jpg", event);
				break;
			default:
				botControl.messageSend("That is not one of the images.", event);
				break;
			}
			
		}
		
		else
		{
			botControl.messageSend("Things weren't entered correctly. Go //picture <image>", event);
		}
	}

	@Override
	public String getDescription() 
	{	
		return 	"**" + getName().toUpperCase() + "**" 
				+ "\n" + "This command posts some hardcoded images." 
				+ "\n" + "There is only one image so far called \"shield\"."
				+ "\n" + "To use it say, \"//picture (image)\". ";
	}

	@Override
	public String getName() 
	{
		
		return "picture";
	}

}
