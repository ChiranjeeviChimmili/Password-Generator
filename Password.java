

public class Password implements Characters{

    private String password;


    public Password(String password) {
        this.password = password;
    }

    public boolean Strength() {
        int lowerCharCount, upperCharCount, specialsCount, intCount = lowerCharCount = upperCharCount = specialsCount = 0;
        int length = this.password.length();
        
        for (int i = 0; i < length; i++) {
            String x = String.valueOf(this.password.charAt(i));
            
            if (charactersLower.contains(x)) {
                lowerCharCount += 1;
            } else if (charactersUpper.contains(x)) {
                upperCharCount += 1;
            } else if (integers.contains(x)) {
                intCount += 1;
            } else {
                specialsCount +=1;
            }
        }

        if ((length/3 >= lowerCharCount + upperCharCount) || (length/4 >= intCount) || (length/5 >= specialsCount)) {
            return false;
        }
        return true;

    }

}
