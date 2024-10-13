package strings;
import java.util.HashMap;
public class Hash {
	public static void main(String args[])
	{
HashMap<Character,Integer>h=new HashMap<>();
String ip="apple";
for(int i=0;i<ip.length();i++)
{
	char x=ip.charAt(i);
	if(!h.containsKey(x))
	{
		h.put(x, 1);
	}
	else
	{
		h.put(x,h.get(x)+1);
	}
}
System.out.println(h);
	}
}
