package MultipleDelegation_MultipleConnector_P_PWP_Signal;

public class MultipleDelegation_MultipleConnector_P_PWP_Signal
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
			MultipleDelegation_MultipleConnector_P_PWP_SignalEnvironment.instance().execute(arg);
		}
	}
}
