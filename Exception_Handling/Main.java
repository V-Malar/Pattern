package exeption;

import java.util.Scanner;

abstract class ShinchanNeedException extends Exception {
	abstract public void need();
}

class ChocolateException extends ShinchanNeedException {
	@Override
	public void need() {
		System.out.println("I need more Chocopie..");
	}
}

class ShiroException extends ShinchanNeedException {
	@Override
	public void need() {
		System.out.println("I need Shiro..");
	}
}

class KazamaException extends ShinchanNeedException {
	@Override
	public void need() {
		System.out.println("I need Kazama to play..");
	}
}

class Shinchan {
	public void get(ShinchanGet s) {
		try {
			s.getException();

		} catch (ShinchanNeedException e) {
			e.need();
		}
	}
}

abstract class ShinchanGet {
	public abstract void getException() throws ShinchanNeedException;
}

class ShinchanChocolate extends ShinchanGet {
	public void getException() throws ShinchanNeedException {
		throw new ChocolateException();
	}
}

class ShinchanShiro extends ShinchanGet {
	public void getException() throws ShinchanNeedException {
		throw new ShiroException();
	}
}

class ShinchanKazama extends ShinchanGet {
	public void getException() throws ShinchanNeedException {
		throw new KazamaException();
	}
}

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Shinchan shinchan = new Shinchan();

		System.out.println("Please enter the item class name...:");
		String s = sc.next();
		ShinchanGet item = (ShinchanGet) Class.forName(s).newInstance();
		shinchan.get(item);
	}
}
