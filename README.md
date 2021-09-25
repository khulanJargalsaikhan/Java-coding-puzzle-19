# Java-coding-puzzle-19

Given a string that contains a single pair of brackets, compute recursively a new string made of 
	only of the brackets and their contents, so "xyz[abc]123" yields "[abc]".

	 EXPECTATIONS:
		insideBrackets("xyz[abc]123")  --- [abc]
		insideBrackets("x[hello]")     --- [hello] 
		insideBrackets("[xy]1")        --- [xy] 
