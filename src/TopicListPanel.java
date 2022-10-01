/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
import java.util.*;
import java.awt.*;
/**
 *
 * @author tylerliu
 */
public class TopicListPanel extends javax.swing.JPanel {

    private Course course;
    private CoursePanel coursePanel;
    /**
     * Creates new form TopicListPanel
     */
    public TopicListPanel(CoursePanel coursePanel, Course course) {
        initComponents();
        this.course = course;
        this.coursePanel = coursePanel;
        
        ArrayList<Topic> topics = course.getTopics();
        GridLayout gl = new GridLayout();
        gl.setColumns(1);
        gl.setRows(2);
        setLayout(gl);
        
        for (int i = 0; i < topics.size(); i++) {
            add(new TopicIcon(coursePanel, topics.get(i)));
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}