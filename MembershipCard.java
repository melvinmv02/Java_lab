import java.util.Scanner;

class MembershipCard
{
    String memberName;
    int memberId;
    int validityYears;

    MembershipCard()
    {
        memberName = "Guest";
        memberId = 0;
        validityYears = 1;
    }

    MembershipCard(String memberName, int memberId, int validityYears)
    {
        this.memberName = memberName;
        this.memberId = memberId;
        this.validityYears = validityYears;
    }
    void displayDetails()
    {
        System.out.println("Member Name:" +memberName);
        System.out.println("Member ID:" +memberId);
        System.out.println("Validity Years:" +validityYears);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("===Default Membership Card===");
        MembershipCard card1 = new MembershipCard();
        card1.displayDetails();
        System.out.println("Enter Member name:");
        String name = sc.nextLine();
        System.out.println("Enter Member Id:");
        int id = sc.nextInt();
        System.out.println("Enter validity years:");
        int years = sc.nextInt();
        System.out.println("===Membership Card with Details===");
        MembershipCard card2 = new MembershipCard(name, id, years);
        card2.displayDetails();
    }
}
