class studentattandence {
    public boolean checkRecord(String s) {
        int Acount = 0;
        int Lcount = 0; // consecutive Ls

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'A') {
                Acount++;
                if (Acount > 1) return false; 
                Lcount = 0;
            }
            
            else if (c == 'L') {
                Lcount++;
                if (Lcount >= 3) return false;
            }
            else {
                Lcount = 0;
            }
        }
        return true; 
    }
    public static void main (String args[]){
        Solution obj=new Solution();
        String s="PPALLP";
        System.out.println(obj.checkRecord(s));
    }
}
