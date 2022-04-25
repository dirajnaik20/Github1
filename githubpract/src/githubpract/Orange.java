package githubpract;

public class Orange {
  String color;
Orange(String color)
{
		this.color=color;
}

String getColor()
{
   return color;
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Orange greenApple = new Orange("Orange");
	String color = greenApple.getColor();
	System.out.println(&quot;color of apple is &quot; + color);

}
}