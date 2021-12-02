import people.Program;
import people.VaccinationStatus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Citizen_main extends JFrame{
    private JButton registerToVaccineProgramButton;
    private JButton submitAppointmentButton;
    private JButton viewVaccineStatusButton;
    private JPanel Citizen_main_Panel;
    public String mailaddress;



    public Citizen_main(String mail) {
        setContentPane(Citizen_main_Panel);
        setVisible(true);
        setSize(450, 300);
        this.mailaddress = mail;
        registerToVaccineProgramButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Citizen_Register_sub crs = new Citizen_Register_sub(mailaddress);
            }
        });
        submitAppointmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Citizen_Appoint_sub cas = new Citizen_Appoint_sub(mailaddress);
            }
        });
        viewVaccineStatusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VaccinationStatus vs = new VaccinationStatus();
                vs.View();
            }
        });

    }
}
