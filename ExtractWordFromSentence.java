class ExtractWordFromSentence
{
	public static void main(String args[])
	{
		String str = "My Name Is Preeti Jain";
		String [] words = str.split(" ", 5);

		for (String word : words)
			System.out.println(word);
	}
}