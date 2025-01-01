package Company1_Microsoft.Problem01;


class Solution {
    public String getHint(String secret, String guess) {

        int bullsCount = 0;
        int cowsCount = 0;
        int size = secret.length();
        StringBuilder hint = new StringBuilder();
        
        if(secret.equals(guess))
        {
            return size + "A" + cowsCount + "B";
        }
        
        char Secret [] = new char[size];
        char Guess [] = new char[size];
        
        for(int i = 0; i < size; i++)
        {
            if(secret.charAt(i) == guess.charAt(i))
            {
                bullsCount++;
                Secret[i] = '*';
                Guess[i] = '*';
            }
            else
            {
                Secret[i] = secret.charAt(i);
                Guess[i] = guess.charAt(i);
            }
            
        }

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {   
                if((i == j) && (Secret[i] == Guess[j]))
                {
                    break;
                }
                else if(Secret[i] == Guess[j] && Guess[j] != '*')
                {
                    cowsCount++;
                    Secret[i] = '*';
                    Guess[j] = '*';
                    break;
                }
            }
            
            
        }

        return bullsCount + "A" + cowsCount + "B";

    }
    
}