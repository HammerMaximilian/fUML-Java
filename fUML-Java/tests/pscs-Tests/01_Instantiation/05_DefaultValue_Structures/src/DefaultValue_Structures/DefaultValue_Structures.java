package DefaultValue_Structures;

public class DefaultValue_Structures
{
	public static void printUsage()
	{
		System.out.println(
            "=============================================================================================\n" +
            "USAGE: <program-name> <behavior-name> [<behavior-name> <behavior-name> <behavior-name> <...>]\n" +
            "=============================================================================================\n"
            );
	}

	public static void main(String[] args)
	{
		if(args.length == 0)
		{
			System.out.println("[ERROR] Must declare at least one behavior name.\n");
			printUsage();
			return;
		}
	
		for (String arg : args)
		{
			DefaultValue_StructuresEnvironment.instance().execute(arg);
		}
	}
}
