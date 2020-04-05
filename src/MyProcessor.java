import java.util.EmptyStackException;
import java.util.Stack;

class MyProcessor{

    Stack <Object>stk;
    private String xpresion;
    private int length;

    public MyProcessor(String xpresion){

        stk = new Stack<>();
        this.xpresion = xpresion;
        this.length =  xpresion.length();

    }

        //Determine is parenthises are balanced

    boolean isBalance()
    {
        int index=0;
        boolean fail=false;

        try
        {
            while (index < length && !fail)
            {
                char ch = xpresion.charAt(index);

                switch (ch)
                {
                    case Constants.LEFT_Normal:
                        stk.push(ch);
                        break;
                    case Constants.RIGHT_Normal:
                        stk.pop();

                    case Constants.LEFT_CURLY:
                        stk.push(ch);
                        break;
                    case Constants.RIGHT_CURLY:
                        stk.pop();
                        break;
                    case Constants.RIGHT_BRAGUETTE:
                        stk.push(ch);
                        break;
                    case Constants.LEFT_BRAGUETTE:
                        stk.pop();
                        break;
                    case Constants.DIVISION:
                       char t = xpresion.charAt(index + 1);
                            if( t=='*')
                                stk.push(ch);
                        break;
                    case Constants.MULTIPLICATION:

                        char d = xpresion.charAt(index + 1);
                           if( d !='/')
                               stk.pop();
                           break;

                    default:
                        break;



                }//end of swtich
                index++;
            }//end of while

        } //end of try block
        catch (EmptyStackException e)
        {
            System.out.println(e.toString());
            fail = true;
        }


        return (stk.empty() && !fail);
    }//end of isBalance





}

