
public class Ticket {
    private Customer customer;
    private String ticketID;
    private String description;
    private String priority;
    private String status;

    public Ticket(String ticketID, String description, String priority, String status, Customer customer) {
        setTicketID(ticketID);
        setDescription(description);
        setPriority(priority);
        setStatus(status);
        setCustomer(customer);
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        if (ticketID == null || ticketID.length() != 4) {
            throw new IllegalArgumentException(" Ticket ID must contain 4 digits ");
        }

        for (int i = 0; i < ticketID.length(); i++) {

            if (ticketID.charAt(i) < '0' || ticketID.charAt(i) > '9') {
                throw new IllegalArgumentException("Ticket ID must contain numbers only");
            }
        }
        this.ticketID = ticketID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description == null||description.isEmpty()) {
            throw new IllegalArgumentException(" Inalid description ");
        }
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        if (priority == null) {
            throw new IllegalArgumentException("Invalid priority");
        }
        if (priority.equalsIgnoreCase("High")) {
            this.priority = "High";
        } else if (priority.equalsIgnoreCase("Medium")) {
            this.priority = "Medium";
        } else if (priority.equalsIgnoreCase("Low")) {
            this.priority = "Low";
        } else {
            throw new IllegalArgumentException("Priority must be High, Medium, or Low");
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status == null) {
            throw new IllegalArgumentException("Invalid status");
        }
        if (status.equalsIgnoreCase("Open")) {
            this.status = "Open";
        } else if (status.equalsIgnoreCase("Closed")) {
            this.status = "Closed";
        } else {
            throw new IllegalArgumentException("Status must be Open or Closed");
        }
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        if (this.customer == null) {
            throw new IllegalArgumentException("Invalid customer");
        }
        this.customer = customer;
    }
    public void display() {
        customer.display();
        System.out.println(" Ticket ID : " + getTicketID());
        System.out.println(" Discreption : " + getDescription());
        System.out.println(" Priority : " + getPriority());
        System.out.println(" Status : " + getStatus());
    }
}
