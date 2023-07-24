// abstract class ShinchanMerchandiseFactory
// {
// 	abstract public void createTShirt();
// 	abstract public void createHat();
// 	abstract public void createToy();
// }
// class ShinchanSummerMerchandiseFactory extends ShinchanMerchandiseFactory
// {

// 	@Override
// 	public void createTShirt() {
// 		// TODO Auto-generated method stub
// 		System.out.println("Create Summer TShirt..");
// 	}

// 	@Override
// 	public void createHat() {
// 		// TODO Auto-generated method stub
// 		System.out.println("Create Summer Hat..");
// 	}

// 	@Override
// 	public void createToy() {
// 		// TODO Auto-generated method stub
// 		System.out.println("Create Summer Toy..");
// 	}
	
// }
// class ShinchanWinterMerchandiseFactory extends ShinchanMerchandiseFactory
// {

// 	@Override
// 	public void createTShirt() {
// 		// TODO Auto-generated method stub
// 		System.out.println("Create Winter TShirt..");
// 	}

// 	@Override
// 	public void createHat() {
// 		// TODO Auto-generated method stub
// 		System.out.println("Create Winter Hat..");
// 	}

// 	@Override
// 	public void createToy() {
// 		// TODO Auto-generated method stub
// 		System.out.println("Create Winter Toy..");
// 	}
	
// }
// abstract class ShinchanTShirt
// {
// 	abstract public void displayDesign();
// }
// abstract class ShinchanHat
// {
// 	abstract public void displayColor();
// }
// abstract class ShinchanToy
// {
// 	abstract public void displaySize();
// }
// class ShinchanSummerTShirt extends ShinchanTShirt
// {
	
// 	@Override
// 	public void displayDesign() {
// 		// TODO Auto-generated method stub
// 		System.out.println("ShinchanSummerTShirt Size..");
// 	}
	
// }
// class ShinchanSummerHat extends ShinchanHat
// {

// 	@Override
// 	public void displayColor() {
// 		// TODO Auto-generated method stub
// 		System.out.println("ShinchanSummerHat Size..");
// 	}
	
// }
// class ShinchanSummerToy extends ShinchanToy
// {

// 	@Override
// 	public void displaySize() {
// 		// TODO Auto-generated method stub
// 		System.out.println("ShinchanSummerToy Size..");
// 	}
	
// }
// class ShinchanWinterTShirt extends ShinchanTShirt
// {

// 	@Override
// 	public void displayDesign() {
// 		// TODO Auto-generated method stub
// 		System.out.println("ShinchanWinterTShirt Size..");
// 	}
	
// }
// class ShinchanWinterHat extends ShinchanHat
// {

// 	@Override
// 	public void displayColor() {
// 		// TODO Auto-generated method stub
// 		System.out.println("ShinchanWinterHat Size..");
// 	}
	
// }
// class ShinchanWinterToy extends ShinchanToy
// {

// 	@Override
// 	public void displaySize() {
// 		// TODO Auto-generated method stub
// 		System.out.println("ShinchanWinterToy Size..");
// 	}
	
// }
// public class Main {

// 	public static void main(String[] args) {
// 		// TODO Auto-generated method stub
		
// 	}

// }


// class Main
// {
// static void display(int steps)
//         {
//         		if (steps == 0)
//                 {
//                 	return;
//                 }
//         		System.out.println("Here..");
//                 display(steps-1);
//         }
// 	public static void main(String args[])
//     {
//     	display(4);
//     }
// }
package test;
interface EnglishDubbing
{
	public void dubEnglish();
}
class JapaneseEpisode
{
	public void playInJapanese()
	{
		System.out.println("Playing in Japanese..");
	}
}
class HindiDubbingAdapter implements EnglishDubbing
{
	JapaneseEpisode j;
	public HindiDubbingAdapter()
	{
		
	}
	public HindiDubbingAdapter(JapaneseEpisode j)
	{
		this.j = j;
	}
	@Override
	public void dubEnglish() {
		// TODO Auto-generated method stub
		j.playInJapanese();
		System.out.println("Dubbed to Hindi..");
	}
	
}
class SpanishDubbingAdapter implements EnglishDubbing
{
	JapaneseEpisode j;
	public SpanishDubbingAdapter()
	{
		
	}
	public SpanishDubbingAdapter(JapaneseEpisode j)
	{
		this.j = j;
	}
	@Override
	public void dubEnglish() {
		// TODO Auto-generated method stub
		j.playInJapanese();
		System.out.println("Dubbed to Spanish..");
	}
	
}
class EnglishDubbingAdapter implements EnglishDubbing
{
	JapaneseEpisode j;
	public EnglishDubbingAdapter()
	{
		
	}
	public EnglishDubbingAdapter(JapaneseEpisode j)
	{
		this.j = j;
	}
	@Override
	public void dubEnglish() {
		// TODO Auto-generated method stub
		j.playInJapanese();
		System.out.println("Dubbed to English..");
	}
	
}
class Good
{
	public static void main(String[] args) {
		new EnglishDubbingAdapter(new JapaneseEpisode()).dubEnglish();
		new SpanishDubbingAdapter(new JapaneseEpisode()).dubEnglish();
		new HindiDubbingAdapter(new JapaneseEpisode()).dubEnglish();
	}
}s
//package test;
//import java.util.HashMap;
//import java.util.Map;
//
//// Flyweight class
//class Sticker {
//    private String category;
//    private String rarity;
//    private String artwork;
//
//    public Sticker(String category, String rarity, String artwork) {
//        this.category = category;
//        this.rarity = rarity;
//        this.artwork = artwork;
//    }
//
//    public void displayInfo() {
//        System.out.println("Sticker: Category - " + category + ", Rarity - " + rarity + ", Artwork - " + artwork);
//    }
//}
//
//// Flyweight Factory class
//class StickerFactory {
//    private Map<String, Sticker> stickersMap = new HashMap<>();
//
//    public Sticker getSticker(String category, String rarity, String artwork) {
//        String key = category + rarity;
//        if (!stickersMap.containsKey(key)) {
//            stickersMap.put(key, new Sticker(category, rarity, artwork));
//        }
//        return stickersMap.get(key);
//    }
//}
//
//public class Good {
//    public static void main(String[] args) {
//        StickerFactory stickerFactory = new StickerFactory();
//
//        // Shinchan's sticker collection
//        Sticker sticker1 = stickerFactory.getSticker("Shinchan", "Common", "Shinchan Playing");
//        sticker1.displayInfo();
//
//        Sticker sticker2 = stickerFactory.getSticker("Shinchan", "Common", "Shinchan Jumping");
//        sticker2.displayInfo(); // Same as sticker1, as it's a flyweight object
//
//        Sticker sticker3 = stickerFactory.getSticker("Friends", "Rare", "Shinchan with Kazama");
//        sticker3.displayInfo();
//
//        // Output:
//        // Sticker: Category - Shinchan, Rarity - Common, Artwork - Shinchan Playing
//        // Sticker: Category - Shinchan, Rarity - Common, Artwork - Shinchan Playing
//        // Sticker: Category - Friends, Rarity - Rare, Artwork - Shinchan with Kazama
//    }
//}
//package test;
////Visitor interface
//interface ShinchanFriendVisitor {
// void visit(ShinchanFriend friend);
//}
//
////Concrete Visitor classes
//class PlayVisitor implements ShinchanFriendVisitor {
// @Override
// public void visit(ShinchanFriend friend) {
//     System.out.println(friend.getName() + " plays games with Shinchan.");
// }
//}
//
//class WatchTVVisitor implements ShinchanFriendVisitor {
// @Override
// public void visit(ShinchanFriend friend) {
//     System.out.println(friend.getName() + " watches TV with Shinchan.");
// }
//}
//
////Element class
//class ShinchanFriend {
// private String name;
//
// public ShinchanFriend(String name) {
//     this.name = name;
// }
//
// public String getName() {
//     return name;
// }
//
// public void accept(ShinchanFriendVisitor visitor) {
//     visitor.visit(this);
// }
//}
//
//public class Good {
// public static void main(String[] args) {
//     ShinchanFriend friend1 = new ShinchanFriend("Kazama");
//     ShinchanFriend friend2 = new ShinchanFriend("Nene");
//     ShinchanFriend friend3 = new ShinchanFriend("Bo-chan");
//
//     friend1.accept(new PlayVisitor());
//     friend2.accept(new WatchTVVisitor());
//     friend3.accept(new PlayVisitor());
//
//     // Output:
//     // Kazama plays games with Shinchan.
//     // Nene watches TV with Shinchan.
//     // Bo-chan plays games with Shinchan.
// }
//}
//package test;
//abstract class HomeworkRoutine {
//    public final void doHomework() {
//        startHomework();
//        doMath();
//        doDrawing();
//        doEnglish();
//        finishHomework();
//    }
//
//    protected abstract void doMath();
//
//    protected abstract void doDrawing();
//
//    protected abstract void doEnglish();
//
//    private void startHomework() {
//        System.out.println("Shinchan starts doing homework...");
//    }
//
//    private void finishHomework() {
//        System.out.println("Shinchan finishes his homework.");
//    }
//}
//
//// Concrete subclasses
//class MathHomework extends HomeworkRoutine {
//    @Override
//    protected void doMath() {
//        System.out.println("Shinchan solves math problems.");
//    }
//
//    @Override
//    protected void doDrawing() {
//        // No drawing in math homework
//    }
//
//    @Override
//    protected void doEnglish() {
//        // No English in math homework
//    }
//}
//
//class DrawingHomework extends HomeworkRoutine {
//    @Override
//    protected void doMath() {
//        // No math in drawing homework
//    }
//
//    @Override
//    protected void doDrawing() {
//        System.out.println("Shinchan draws pictures.");
//    }
//
//    @Override
//    protected void doEnglish() {
//        // No English in drawing homework
//    }
//}
//
//class EnglishHomework extends HomeworkRoutine {
//    @Override
//    protected void doMath() {
//        // No math in English homework
//    }
//
//    @Override
//    protected void doDrawing() {
//        // No drawing in English homework
//    }
//
//    @Override
//    protected void doEnglish() {
//        System.out.println("Shinchan practices English.");
//    }
//}
//
//public class Good {
//    public static void main(String[] args) {
//        HomeworkRoutine mathHomework = new MathHomework();
//        HomeworkRoutine drawingHomework = new DrawingHomework();
//        HomeworkRoutine englishHomework = new EnglishHomework();
//
//        mathHomework.doHomework();
//        drawingHomework.doHomework();
//        englishHomework.doHomework();
//
//        // Output:
//        // Shinchan starts doing homework...
//        // Shinchan solves math problems.
//        // Shinchan finishes his homework.
//        // Shinchan starts doing homework...
//        // Shinchan draws pictures.
//        // Shinchan finishes his homework.
//        // Shinchan starts doing homework...
//        // Shinchan practices English.
//        // Shinchan finishes his homework.
//    }
//}
//package test;
//
////State interface
//interface MoodState {
//	void sayMood();
//}
//
////Concrete State classes
//class HappyState implements MoodState {
//	@Override
//	public void sayMood() {
//		System.out.println("Shinchan is feeling Happy!");
//	}
//}
//
//class SadState implements MoodState {
//	@Override
//	public void sayMood() {
//		System.out.println("Shinchan is feeling Sad.");
//	}
//}
//
//class HyperState implements MoodState {
//	@Override
//	public void sayMood() {
//		System.out.println("Shinchan is feeling Hyper!");
//	}
//}
//
////Context class
//class ShinchanMood {
//	private MoodState moodState;
//
//	public void setMoodState(MoodState moodState) {
//		this.moodState = moodState;
//	}
//
//	public void expressMood() {
//		moodState.sayMood();
//	}
//}
//
//public class Good {
//	public static void main(String[] args) {
//		ShinchanMood shinchan = new ShinchanMood();
//		while (true) {
//			shinchan.setMoodState(new HappyState());
//
//			shinchan.expressMood();
//
//			shinchan.setMoodState(new SadState());
//			shinchan.expressMood();
//
//			shinchan.setMoodState(new HyperState());
//			shinchan.expressMood();
//		}
//
//		// Output:
//		// Shinchan is feeling Happy!
//		// Shinchan is feeling Sad.
//		// Shinchan is feeling Hyper!
//	}
//}
//package test;
////Strategy interface
//interface CookingStrategy {
// void cook(String recipe);
//}
//
////Concrete Strategy classes
//class BakingStrategy implements CookingStrategy {
// @Override
// public void cook(String recipe) {
//     System.out.println("Baking " + recipe);
// }
//}
//
//class FryingStrategy implements CookingStrategy {
// @Override
// public void cook(String recipe) {
//     System.out.println("Frying " + recipe);
// }
//}
//
//class BoilingStrategy implements CookingStrategy {
// @Override
// public void cook(String recipe) {
//     System.out.println("Boiling " + recipe);
// }
//}
//
////Context class
//class ShinchanCookingGame {
// private CookingStrategy cookingStrategy;
//
// public void setCookingStrategy(CookingStrategy cookingStrategy) {
//     this.cookingStrategy = cookingStrategy;
// }
//
// public void prepareRecipe(String recipe) {
//     if (cookingStrategy != null) {
//         cookingStrategy.cook(recipe);
//     } else {
//         System.out.println("Please choose a cooking strategy first.");
//     }
// }
//}
//
//public class Good {
// public static void main(String[] args) {
//     ShinchanCookingGame cookingGame = new ShinchanCookingGame();
//
//     // Shinchan prepares different recipes using different strategies
//     cookingGame.setCookingStrategy(new BakingStrategy());
//     cookingGame.prepareRecipe("Chocolate Cake");
//
//     cookingGame.setCookingStrategy(new FryingStrategy());
//     cookingGame.prepareRecipe("Fried Rice");
//
//     cookingGame.setCookingStrategy(new BoilingStrategy());
//     cookingGame.prepareRecipe("Noodles");
//
//     // Output:
//     // Baking Chocolate Cake
//     // Frying Fried Rice
//     // Boiling Noodles
// }
//}

//package test;
//
//import java.util.HashMap;
//import java.util.Map;
//
//interface Command {
//    void execute();
//}
//
//// Receiver class
//class ShinchanTV {
//    public void turnOn() {
//        System.out.println("Shinchan's TV is ON");
//    }
//
//    public void turnOff() {
//        System.out.println("Shinchan's TV is OFF");
//    }
//
//    public void changeChannel(int channel) {
//        System.out.println("Channel changed to " + channel);
//    }
//
//    public void volumeUp() {
//        System.out.println("Volume increased");
//    }
//}
//
//// Concrete Command classes
//class TurnOnCommand implements Command {
//    private ShinchanTV tv;
//
//    public TurnOnCommand(ShinchanTV tv) {
//        this.tv = tv;
//    }
//
//    @Override
//    public void execute() {
//        tv.turnOn();
//    }
//}
//
//class TurnOffCommand implements Command {
//    private ShinchanTV tv;
//
//    public TurnOffCommand(ShinchanTV tv) {
//        this.tv = tv;
//    }
//
//    @Override
//    public void execute() {
//        tv.turnOff();
//    }
//}
//
//class ChangeChannelCommand implements Command {
//    private ShinchanTV tv;
//    private int channel;
//
//    public ChangeChannelCommand(ShinchanTV tv, int channel) {
//        this.tv = tv;
//        this.channel = channel;
//    }
//
//    @Override
//    public void execute() {
//        tv.changeChannel(channel);
//    }
//}
//
//class VolumeUpCommand implements Command {
//    private ShinchanTV tv;
//
//    public VolumeUpCommand(ShinchanTV tv) {
//        this.tv = tv;
//    }
//
//    @Override
//    public void execute() {
//        tv.volumeUp();
//    }
//}
//
//// Invoker class
//class RemoteControl {
//    private Map<String, Command> commands;
//
//    public RemoteControl() {
//        commands = new HashMap<>();
//    }
//
//    public void setCommand(String commandName, Command command) {
//        commands.put(commandName, command);
//    }
//
//    public void pressButton(String commandName) {
//        Command command = commands.get(commandName);
//        if (command != null) {
//            command.execute();
//        } else {
//            System.out.println("Invalid command: " + commandName);
//        }
//    }
//}
//
//public class Good {
//    public static void main(String[] args) {
//        ShinchanTV tv = new ShinchanTV();
//        RemoteControl remoteControl = new RemoteControl();
//
//        // Set the commands in the remote control
//        remoteControl.setCommand("on", new TurnOnCommand(tv));
//        remoteControl.setCommand("off", new TurnOffCommand(tv));
//        remoteControl.setCommand("channel", new ChangeChannelCommand(tv, 5));
//        remoteControl.setCommand("volume", new VolumeUpCommand(tv));
//
//        // Press buttons on the remote control
//        remoteControl.pressButton("on");
//        remoteControl.pressButton("channel");
//        remoteControl.pressButton("volume");
//        remoteControl.pressButton("off");
//        remoteControl.pressButton("invalid");
//
//        // Output:
//        // Shinchan's TV is ON
//        // Channel changed to 5
//        // Volume increased
//        // Shinchan's TV is OFF
//        // Invalid command: invalid
//    }
//}
//package test;
//abstract class ShinchanCake
//{
//	abstract public int getCakeDetails();
//}
//abstract class BasicShinchanCake extends ShinchanCake
//{
//	
//}
//class ChocolateDecoration extends BasicShinchanCake
//{
//	ShinchanCake s;
//	public ChocolateDecoration()
//	{
//		
//	}
//	public ChocolateDecoration(ShinchanCake s)
//	{
//		this.s = s;
//	}
//	public int getCakeDetails()
//	{
//	if (s!=null)
//	{
//		return 100 + s.getCakeDetails();
//	}
//	else 
//	{
//		return 100;
//	}
//	}
//}
//class FruitToppings extends BasicShinchanCake
//{
//	ShinchanCake s;
//	public FruitToppings()
//	{
//		
//	}
//	public FruitToppings(ShinchanCake s)
//	{
//		this.s = s;
//	}
//	public int getCakeDetails()
//	{
//		if (s!=null)
//		{
//			return s.getCakeDetails() + 100;
//		}
//		else
//		{
//			return 100;
//		}
//	}
//}
//class Good 
//{
//	public static void main(String[] args) {
//		ShinchanCake s = new FruitToppings(new ChocolateDecoration());
//		System.out.println("Total Cost: " + s.getCakeDetails());
//	}
//}
//package test;
//interface ColoringTool
//{
//	public void color();
//}
//class Crayon implements ColoringTool
//{
//
//	@Override
//	public void color() {
//		// TODO Auto-generated method stub
//		System.out.println("Crayon Color theme added..");
//	}
//	
//}
//class WaterColor implements ColoringTool
//{
//
//	@Override
//	public void color() {
//		// TODO Auto-generated method stub
//		System.out.println("Water Color theme added..");
//	}
//	
//}
//interface ColoringTheme
//{
//	public void applyTheme();
//}
//class NormalColors implements ColoringTheme
//{
//	Crayon c;
//	public NormalColors()
//	{
//		
//	}
//	public NormalColors(Crayon c)
//	{
//		this.c = c;
//	}
//	@Override
//	public void applyTheme() {
//		// TODO Auto-generated method stub
//		System.out.println("NormalColors theme added..");
//		c.color();
//	}
//	
//}
//class NeonColors implements ColoringTheme
//{
//	WaterColor w;
//	public NeonColors()
//	{
//		
//	}
//	public NeonColors(WaterColor w)
//	{
//		this.w = w;
//	}
//	@Override
//	public void applyTheme() {
//		// TODO Auto-generated method stub
//		System.out.println("NeonColors theme added..");
//		w.color();
//	}
//	
//}
//class Good 
//{
//	public static void main(String[] args) {
//		Crayon c = new Crayon();
//		WaterColor w = new WaterColor();
//		NormalColors normal = new NormalColors(c);
//		NeonColors neon = new NeonColors(w);
//		normal.applyTheme();
//		neon.applyTheme();
//	}
//}
//You are part of the "Shinchan English Dubbing Studio," 
//and your task is to implement the Adapter Pattern to enable the
//dubbing of Shinchan episodes in different languages. The studio
//receives episodes in the original Japanese language and wants to 
//dub them in English, Hindi, and Spanish.
//package test;
//
//abstract interface EnglishDubbing {
//	abstract public void dubInEnglish();
//}
//
//class JapaneseEpisode implements EnglishDubbing {
//
//	public void playInJapanese() {
//		System.out.println("Playing in Japanese..");
//	}
//
//	@Override
//	public void dubInEnglish() {
//		// TODO Auto-generated method stub
//		System.out.println("Playing in English");
//
//	}
//}
//
//class HindiDubbingAdapter implements EnglishDubbing {
//	@Override
//	public void dubInEnglish() {
//		// TODO Auto-generated method stub
//		System.out.println("Dubbed from Hindi to English");
//	}
//
//}
//
//class SpanishDubbingAdapter implements EnglishDubbing {
//	JapaneseEpisode jp;
//
//	@Override
//	public void dubInEnglish() {
//		// TODO Auto-generated method stub
//		System.out.println("Dubbed from Spanish to English");
//	}
//
//}
//
//class EnglishDubbingAdapter implements EnglishDubbing {
//	JapaneseEpisode je;
//
//	public EnglishDubbingAdapter() {
//
//	}
//
//	public EnglishDubbingAdapter(JapaneseEpisode je) {
//		this.je = je;
//	}
//
//	@Override
//	public void dubInEnglish() {
//		je.playInJapanese();
//
//	}
//
//}
//
//class Good {
//	public static void main(String[] args) {
//		new EnglishDubbingAdapter().dubInEnglish();
//	}
//}
//package test;
//
//import java.util.Scanner;
//
//abstract class ShinchanCharacter implements Cloneable {
//	abstract public void display();
//}
//
//class Himawari extends ShinchanCharacter {
//	String new_name = "";
//	public Himawari()
//	{
//		
//	}
//	public Himawari(String new_name)
//	{
//		this.new_name = new_name;
//	}
//	String character_name = "Himawari";
//	int age = 3;
//	String fav_food = "Milk";
//
//	@Override
//	public void display() {
//		// TODO Auto-generated method stub
//		System.out.println(new_name + " " + character_name + " " + age + " " + fav_food);
//	}
//
//	@Override
//	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
//
//}
//
//class Masaw extends ShinchanCharacter {
//	String character_name = "Masaw";
//	int age = 5;
//	String fav_food = "Sushi";
//
//	@Override
//	public void display() {
//		// TODO Auto-generated method stub
//		System.out.println(character_name + " " + age + " " + fav_food);
//	}
//	@Override
//	public Object clone() throws CloneNotSupportedException
//	{
//		return super.clone();
//	}
//
//}
//
//class CharacterCache {
//	Scanner sc = new Scanner(System.in);
//	String new_name = sc.next();
//	Himawari hima;
//	Masaw masaw;
//	CharacterCache()
//	{
//		hima = new Himawari(new_name);
//		masaw = new Masaw();
//	}
//	public Himawari getHimaClone() throws CloneNotSupportedException
//	{
//		return (Himawari)hima.clone();
//	}
//	public Masaw getMasawClone() throws CloneNotSupportedException
//	{
//		return (Masaw)masaw.clone();
//	}
//}
//class Good
//{
//	public static void main(String[] args) throws CloneNotSupportedException {
//		CharacterCache c = new CharacterCache();
//		new Himawari().display();
//		System.out.println("After Cloned Himawari");
//		c.getHimaClone().display();
//		
//	}
//}
//package test;
//class SingleShinchan
//{
//	private static SingleShinchan ss;
//	private SingleShinchan()
//	{
//		System.out.println("Hello...");
//	}
//	static SingleShinchan getInstance()
//	{
//		if (ss == null)
//		{
//			return ss = new SingleShinchan();
//		}
//		else 
//		{
//			return ss;
//		}
//	}
//	public void display()
//	{
//		System.out.println("Hideout");
//	}
//}
//class Good
//{
//	public static void main(String[] args) {
//		SingleShinchan s1 = SingleShinchan.getInstance();
//		s1.display();
//		SingleShinchan s2 = SingleShinchan.getInstance();
//		s2.display();
//		if (s1 == s2)
//		{
//			System.out.println("Both are pointing same instance...\n" + s1 + "\n" + s2);
//		}
//	}
//}
//package test;
//class Good
//{
//	public static void main(String[] args) {
//		GatherToys g = new GatherToys()
//				.setName(new Name())
//				.setFatherName(new Father()).setFavouriteFood(new FavouriteFood())
//				.setMotherName(new Mother()).setSisterName(new Sister()).setPet(new Pet());
//		ConstructSet c = g.build();
//		System.out.println(c);
//		
//	}
//}
//class ConstructSet
//{
//	Name name;
//	Sister sister;
//	FavouriteFood fav_food;
//	Mother mother;
//	Father father;
//	Pet pet;
//	public ConstructSet()
//	{
//		
//	}
//	public ConstructSet(GatherToys g)
//	{
//		this.name = g.name;
//		this.sister = g.sister;
//		this.fav_food = g.fav_food;
//		this.mother = g.mother;
//		this.father = g.father;
//		this.pet =g.pet;
//	}
//	@Override
//	public String toString()
//	{
//		return "Toy set has -> \nShinchan: " + name + "\nSister: " + sister + "\nFavourite Food: " + fav_food
//				+ "\n Mother: " + mother + "\n Father: " + father + "\nPet: " + pet + "\nTotal Cost: " + totalcost();
//	}
//	int cost = 0;
//	public int totalcost()
//	{
//		if (name!=null)
//		{
//			cost = cost + 200;
//		}
//		if (sister!=null)
//		{
//			cost = cost + 300;
//		}
//		if (fav_food!=null)
//		{
//			cost = cost + 120;
//		}
//		if (mother!=null)
//		{
//			cost = cost + 500;
//		}
//		if (father!= null)
//		{
//			cost= cost + 500;
//		}
//		if (pet!=null)
//		{
//			cost = cost + 600;
//		}
//		return cost;
//	}
//}
//class GatherToys
//{
//	Name name;
//	Sister sister;
//	FavouriteFood fav_food;
//	Mother mother;
//	Father father;
//	Pet pet;
//	public GatherToys setName(Name name)
//	{
//		this.name=name;
//		System.out.println("HELLOHO" + name);
//		return this;
//	}
//	public GatherToys setSisterName(Sister sister)
//	{
//		this.sister = sister;
//		return this;
//	}
//	public GatherToys setFavouriteFood(FavouriteFood fav_food)
//	{
//		this.fav_food = fav_food;
//		return this;
//	}
//	public GatherToys setMotherName(Mother mother)
//	{
//		this.mother = mother;
//		return this;
//	}
//	public GatherToys setFatherName(Father father)
//	{
//		this.father = father;
//		return this;
//	}
//	public ConstructSet build()
//	{
//		return new ConstructSet(this);
//	}
//	public GatherToys setPet(Pet pet)
//	{
//		this.pet =pet;
//		return this;
//	}
//}
//class Name
//{
//	String name = "Shinchan";	
//	@Override
//	public String toString()
//	{
//		return name;
//	}
//}
//class Sister
//{
//	String sister = "Himawari";
//	@Override
//	public String toString()
//	{
//		return sister;
//	}
//}
//class FavouriteFood
//{
//	String fav_food = "Sushi";
//	@Override
//	public String toString()
//	{
//		return fav_food;
//	}
//}
//class Mother 
//{
//	String mother= "Mitsy";
//	@Override
//	public String toString()
//	{
//		return mother;
//	}
//}
//class Father
//{
//	String father = "Harry";
//	@Override
//	public String toString()
//	{
//		return father;
//	}
//}
//class Pet
//{
//	String pet = "Shiro";
//	@Override
//	public String toString()
//	{
//		return pet;
//	}
//}
//package test;
//
//import java.util.Scanner;
//
//abstract class ShinchanFactory
//{
//	abstract public void animeName();
//}
//class RealShinchan extends ShinchanFactory
//{
//	@Override
//	public void animeName()
//	{
//		System.out.println("Hi, I'm Shinchan..");
//	}
//}
//class Shiro extends ShinchanFactory
//{
//	@Override
//	public void animeName()
//	{
//		System.out.println("Hi, I'm Shiro..");
//	}
//}
//class Himawari extends ShinchanFactory
//{
//	@Override
//	public void animeName()
//	{
//		System.out.println("Hi, I'm Himawari..");
//	}
//}
//public class Good {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		boolean set = true;
//		while (set)
//		{
//		System.out.println("Enter your fav character and get message from them..");
//		String fav_anime = sc.next();
//		if (fav_anime.equalsIgnoreCase("Shinchan"))
//		{
//			new RealShinchan().animeName();
//			set=false;
//		}
//		else if (fav_anime.equalsIgnoreCase("Shiro"))
//		{
//			new Shiro().animeName();
//			set=false;
//		}
//		else if (fav_anime.equalsIgnoreCase("Himawari"))
//		{
//			new Himawari().animeName();
//			set=false;
//		}
//		else
//		{
//			System.out.println("No match...May be another Cartoon type..");
//			set=true;
//		}
//		}
//	}
//
//}
