package MultipleDelegation_SameConnector_P_P_Operation;

public class MultipleDelegation_SameConnector_P_P_Operation
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
			MultipleDelegation_SameConnector_P_P_OperationEnvironment.instance().execute(arg);
		}
	}
}
