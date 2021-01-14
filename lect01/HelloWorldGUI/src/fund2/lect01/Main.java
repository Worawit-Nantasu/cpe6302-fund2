// 1 Collaborator
// 6230300869 นายวรวิทย์ นันทะสุ
package bot;

import java.util.Scanner;

class Tamjung {
  private Scanner scanner;
  private String botName;
  private int createdYear;

  Tamjung(String botName, int createdYear) {
    this.scanner = new Scanner(System.in);
    this.botName = botName;
    this.createdYear = createdYear;
  }

  void greeting() {
    // การรับข้อมูลจากคีย์บอร์ด
    System.out.println("สวัสดี!" + this.botName);
    System.out.println("ฉันถูกสร้างเมื่อปี" + this.createdYear);
    System.out.println("เธอชื่ออะไร?");
    System.out.print(">");
    String input = this.scanner.nextLine();
    System.out.println("สวัสดี" + input + "!");
  }

  void guessAge() {
    System.out.println("ฉันเดาว่าเธออายุเท่าไหร่");
    System.out.println("ช่วยบอก เศษที่ได้จากการหารอายุของเธอด้วย 3 5 และ 7");
    System.out.print(">");
    int rem3 = this.scanner.nextInt();
    System.out.print(">");
    int rem5 = this.scanner.nextInt();
    System.out.print(">");
    int rem7 = this.scanner.nextInt();
    int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
    System.out.println("เธออายุ " + age + ": เป็นช่วงอายุที่น่าสนุกมากของชีวิตเลย!");
  }

  void countNumber() {
    // ใช้ while-loop
    System.out.println("ตอนนี้ ฉันจะแสดงให้เธอเห็นว่าฉันนับเลข 1-100ได้นะ");
    System.out.println("เธอต้องการให้ฉันนับถึงเลขอะไร?");
    System.out.print(">");
    int inputNum = this.scanner.nextInt();

    int i = 1;
    do {
      System.out.println(i + "!");
    } while (++i <= inputNum);

  }

  void quiz() {
    // ใช้ switch statement
    System.out.println("ฉันขอทดสอบความรู้เกี่ยวกับการเขียนโปรแกรมของเธอหน่อยนะ");
    System.out.println("ทำไมเราถึงต้องใช้ method?");
    System.out.println("ก. เพื่อรันคำสั่งซ้ำหลาย ๆ ครั้ง");
    System.out.println("ข. เพื่อแบ่งโปรแกรมออกเป็น subroutine เล็กๆ หลายๆ รูทีน");
    System.out.println("ค. เพื่อวัดเวลาการรันโปรแกรม");
    System.out.println("ง. เพื่ออินเตอร์รัพการทำงานของโปรแกรม");

  }

  public static void main(String[] args) {
    Tamjung bot = new Tamjung("tamjung", 2020);
    bot.greeting();
    bot.guessAge();
    bot.countNumber();
    bot.quiz();
  }
}
