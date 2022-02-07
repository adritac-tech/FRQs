
import java.lang.Math;

public class cb2
{
    private String resultSeq;

    public cb2(String seq)
    {
        resultSeq = seq;
        System.out.println("LightSequence");
    }

    public String insertSegment(String segment, int ind)
    {
        resultSeq = resultSeq.substring(0,ind+1) + segment + resultSeq.substring(ind+1);
        return resultSeq;
    }

    public String changeSequence(String seq)
    {
        resultSeq = seq;
        return resultSeq;
    }

    public String display()
    {
        return resultSeq;
    }

    public static String questionE(String oldSeq, String oldSegment, String newSegment)
    {
        String newSeq = oldSeq.replaceFirst(oldSegment, newSegment);
        System.out.println(newSeq);
        return newSeq;
    }


    public static void questionF(double a, double b)
    {
        double c = Math.sqrt(a*a + b * b);
        System.out.println(c);
    }


    
}