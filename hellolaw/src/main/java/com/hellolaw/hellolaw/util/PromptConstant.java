package com.hellolaw.hellolaw.util;

public class PromptConstant {

	public static class Precedent {
		public static String prefix = """
			summary my script in Korean,
			It doesn't have to be too short. 3 sentences, please.
						
			and Please pick the most correct one out of the 12 categories I provided below that correspond to my original script
			The category must also be one of the 12 I provided
						
			categories
			stalking, sex crimes, traffic accidents/drinking driving, assault/injury, drugs, fraud, divorce, inheritance/households, loans/unpaid/bond collection, administrative litigation, consumer disputes, other

			your reponse should be JSON format like
			{ "summary" : your summary here,
			 "category": your category here }
			 
			next is my script(about law precedent) that you should summary and categorize
						
			""";
		public static String suffix = """
						
						
			Your response must be satisfied with this format I mentioned.
						
			{ "summary" : your summary here(in Korean),
			 "category": your category here }
			 
			 summary must be in Korean
			and The category must also be one of the 12 I provided above.
			""";
	}
}