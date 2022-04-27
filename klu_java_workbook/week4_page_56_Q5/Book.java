package week4_page_56_Q5;

public class Book {
    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public int getYop() {
        return yop;
    }

    public void setYop(int yop) {
        this.yop = yop;
    }

    private String bName,bAuthor, bId;
        private int yop;
    boolean checkName()
    {
        boolean f =true;
        for (int i=0;i<bName.length(); i++)
        {
            if (bName.charAt(i)>='A' && bName.charAt(i)<='Z' ||  bName.charAt(i)>='a' && bName.charAt(i)<='a' || bName.charAt(i)=='_')
            {
                continue;
            }
            else
            {
                f=true;
                break;
            }
        }
        return f;
    }

    boolean checkId()
    {
        boolean f = true;
        for (int i=0; i<=bId.length(); i++)
        {
            if (bId.charAt(i)>='A' && bId.charAt(i)<='Z' || bId.charAt(i)>='a' && bId.charAt(i)<'z' || bId.charAt(i)=='_')
            {
                continue;
            }
            else {
                f =false;
                break;
            }
        }
        return f;
    }

    boolean checkbAuthor()
    {
        boolean f =true;
        for (int i=0; i<bAuthor.length();i++)
        {
            if (bAuthor.charAt(i)>='A' && bAuthor.charAt(i)<'Z' || bAuthor.charAt(i)>'a' && bAuthor.charAt(i)<'z' || bAuthor.charAt(i)=='_')
            {
                continue;
            }
            else
                f =false;
            break;
        }
        return f;
    }

    boolean checkYOP()
    {
        int n= yop, c=0;
        while (n>0)
        {
            c++;
            n=n/10;
        }
        if (c==4)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public String toString()
    {
        String str;
        if (checkbAuthor() && checkId() && checkYOP() && checkName())
        {
            str = String.format("Book Name: %s\n Book Author: %s\n Book Id: %s\n Book Year of Public: %d\n", bName, bAuthor, bId, yop);
            return str;
        }
        else
             str = String.format("Invalid input:");
        return str;
    }

}
