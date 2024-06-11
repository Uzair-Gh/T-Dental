/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tdental;

import java.util.ArrayList;
import java.util.List;

public class FeedbackService {
    private static FeedbackService instance;
    private List<Complaint> complaints;
    private List<Feedback> feedbacks;

    private FeedbackService() {
        complaints = new ArrayList<>();
        feedbacks = new ArrayList<>();
    }

    public static FeedbackService getInstance() {
        if (instance == null) {
            instance = new FeedbackService();
        }
        return instance;
    }

    public void addComplaint(Complaint complaint) {
        complaints.add(complaint);
    }

    public void addFeedback(Feedback feedback) {
        feedbacks.add(feedback);
    }

    public List<Complaint> getComplaints() {
        return complaints;
    }

    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }
}
