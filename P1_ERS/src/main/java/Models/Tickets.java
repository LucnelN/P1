package Models;

public class Tickets {

	private int Ticket_ID;
	private double Amount;
	private String Ticket_Desc;
	private String Type;
	private String Status;
	private String Username;

	public Tickets() {
		super();
	}

	public Tickets(int ticket_ID, double amount, String ticket_Desc, String type, String status, String username) {
		super();
		this.Ticket_ID = ticket_ID;
		this.Amount = amount;
		this.Ticket_Desc = ticket_Desc;
		this.Type = type;
		this.Status = status;
		this.Username = username;
	}

	public int getTicket_ID() {
		return Ticket_ID;
	}

	public void setTicket_ID(int ticket_ID) {
		Ticket_ID = ticket_ID;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	public String getTicket_Desc() {
		return Ticket_Desc;
	}

	public void setTicket_Desc(String ticket_Desc) {
		Ticket_Desc = ticket_Desc;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	@Override
	public String toString() {
		return "Tickets [Ticket_ID=" + Ticket_ID + ", Amount=" + Amount + ", Ticket_Desc=" + Ticket_Desc + ", Type="
				+ Type + ", Status=" + Status + ", Username=" + Username + "]";
	}

}
