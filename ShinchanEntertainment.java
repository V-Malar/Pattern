package trycatchfinally;

import java.util.Scanner;

public class ShinchanEntertainment {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Shiro shiro = new Shiro();
		Shinchan shinchan = new Shinchan();
		String inputclassname = sc.next();
		Things things = (Things)Class.forName(inputclassname).newInstance();
		shinchan.playWithShiro(shiro, things);
	}

}
class Shiro
{
	public void play(Things things) throws PlayExceptions
	{
		things.play();
	}
}
class Shinchan
{
	public void playWithShiro(Shiro shiro, Things things)
	{
		try
		{
			shiro.play(things);
		}
		catch(PlayExceptions pe)
		{
			pe.visit();
		}
	}
}
abstract class Things {
	abstract public void play() throws PlayExceptions;
}

class Chocopie extends Things {

	@Override
	public void play() throws PlayExceptions {
		// TODO Auto-generated method stub
		throw new Eat();
	}

}

class Ludo extends Things {

	@Override
	public void play() throws PlayExceptions {
		// TODO Auto-generated method stub
		throw new Competite();
	}

}

class ActionComin extends Things {
	@Override
	public void play() throws PlayExceptions {
		// TODO Auto-generated method stub
		throw new Fight();
	}
}

class Book extends Things {
	@Override
	public void play() throws PlayExceptions {
		// TODO Auto-generated method stub
		throw new Draw();
	}
}

class Song extends Things {

	@Override
	public void play() throws PlayExceptions {
		// TODO Auto-generated method stub
		throw new Dance();
	}

}

abstract class PlayExceptions extends Exception {
	abstract public void visit();
}
class Eat extends PlayExceptions
{

	@Override
	public void visit() {
		// TODO Auto-generated method stub
		new Activity().action(this);
	}
	
}
class Competite extends PlayExceptions
{

	@Override
	public void visit() {
		// TODO Auto-generated method stub
		new Activity().action(this);
	}
	
}
class Fight extends PlayExceptions
{
	@Override
	public void visit() {
		// TODO Auto-generated method stub
		new Activity().action(this);
	}
}
class Draw extends PlayExceptions
{
	@Override
	public void visit() {
		// TODO Auto-generated method stub
		new Activity().action(this);
	}
}
class Dance extends PlayExceptions
{
	@Override
	public void visit() {
		// TODO Auto-generated method stub
		new Activity().action(this);
	}
}
class Activity
{
	public void action(Eat e)
	{
		System.out.println("Shinchan and Shiro eat Chocopie..");
	}
	public void action(Competite c)
	{
		System.out.println("Shinchan and Shiro competite to Win..");
	}
	public void action(Fight f)
	{
		System.out.println("Shinchan and Shiro fight for Action Comin..");
	}
	public void action(Draw dr)
	{
		System.out.println("Shinchan and Shiro going to Draw..");
	}
	public void action(Dance da)
	{
		System.out.println("Shinchan and Shiro going to Dance..");
	}
}