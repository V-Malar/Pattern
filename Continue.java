package exeption;

import java.util.Scanner;

abstract class ShinchanAttack
{
	ShinchanGun sg;
	ShinchanMonster sm;
	Scanner sc = new Scanner(System.in);
	public void setAttack(ShinchanGun sg) throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		this.sg = sg;
		String s = sc.next();
		sm = (ShinchanMonster)Class.forName(s).newInstance();
		sg.gunLoad(sm);
	}
}
interface ShinchanGun
{
	public void gunLoad(ShinchanMonster sm);
}
class WaterGun implements ShinchanGun
{
	@Override
	public void gunLoad(ShinchanMonster sm) {
		// TODO Auto-generated method stub
		sm.monsterAttack();
		System.out.println("I know how to kill you..");
		new Handle().handle(this);
	}
}
class FireGun implements ShinchanGun
{
	@Override
	public void gunLoad(ShinchanMonster sm) {
		// TODO Auto-generated method stub
		System.out.println("Fire Shot...");
	}
}
class BulletGun implements ShinchanGun
{
	@Override
	public void gunLoad(ShinchanMonster sm) {
		// TODO Auto-generated method stub
		System.out.println("Bullet Shot...");
	}
}
class RubberGun implements ShinchanGun
{
	@Override
	public void gunLoad(ShinchanMonster sm) {
		// TODO Auto-generated method stub
		System.out.println("Rubber shot...");
	}
}
interface ShinchanMonster
{
	public void monsterAttack();
}
abstract class MonsterSpeak
{
	public void shout()
	{
		System.out.println("You can't kill me...\nI'm unbeatable...Hee..Hee..");
	}
}
class WaterMonster extends MonsterSpeak implements ShinchanMonster
{
	@Override
	public void monsterAttack() {
		// TODO Auto-generated method stub
		shout();
		System.out.println("Water only destroys me...");
	}
}
class FireMonster extends MonsterSpeak implements ShinchanMonster
{
	@Override
	public void monsterAttack() {
		// TODO Auto-generated method stub
		shout();
		System.out.println("Fire only destroys me...");
	}
}
class BUlletMonster extends MonsterSpeak implements ShinchanMonster
{
	@Override
	public void monsterAttack() {
		// TODO Auto-generated method stub
		shout();
		System.out.println("Bullet only destroys me...");
	}
}
class RubberMonster extends MonsterSpeak implements ShinchanMonster
{
	@Override
	public void monsterAttack() {
		// TODO Auto-generated method stub
		shout();
		System.out.println("Rubber only destroys me...");
	}
}
class War extends ShinchanAttack
{
	public War() {
		// TODO Auto-generated constructor stub
		System.out.println("Monster Entered..[Identify and destroy it Shinchan..]");
	}
}
class Shot
{
	public Shot()
	{
		System.out.println("Oh..You shot me...You won..");
	}
}
class Handle
{
	public void handle(WaterGun wg)
	{		
		System.out.println("Water Shot...");
		new Shot();
	}
	public void handle(FireGun wg)
	{
		System.out.println("Oh..You shot me...You won..");
	}
	public void handle(BulletGun wg)
	{
		System.out.println("Oh..You shot me...You won..");
	}
	public void handle(RubberGun wg)
	{
		System.out.println("Oh..You shot me...You won..");
	}
}


public class Strategy1 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
ShinchanAttack s = new War();
s.setAttack(new WaterGun());
	}

}
