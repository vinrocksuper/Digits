import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;
    public Digits(int nums){
        digitList = new ArrayList<>();
        while(nums >= 0)
        {
            if(nums < 10)
            {
                int temp = nums %10;

                digitList.add(0,temp);
                break;
            }
            int temp = nums %10;
            nums = nums / 10;
            digitList.add(0,temp);

        }
    }
    public boolean isStrictlyIncreasing()
    {
        for(int i=0;i<digitList.size()-1;i++)
        {
            if(digitList.get(i) >= digitList.get(i+1))
            {
                return false;
            }
        }
        return true;
    }
    public ArrayList<Integer> getDigitList()
    {
        return this.digitList;
    }
}
