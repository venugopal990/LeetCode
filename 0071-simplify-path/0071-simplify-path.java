class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();

		
		for (String directory : path.split("/")) {
			
			
			 if(!st.isEmpty() && directory.equals("..")) {
					
					st.pop();
					
				}else if(!directory.isEmpty() && !directory.equals(".") && !directory.equals("..")) {
					
					st.push(directory);
				
				}
			
		}
		

		String result = "/"+String.join("/", st);
		
		return result;
    }
}