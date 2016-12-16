/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author jorgetrovisco
 */
public class CriaHorario2 {
    public static void guardaFicheiro(AulasExistentes aulas) {
        final String FILENAME = "HORARIOS";
        File predefHorarios = new File(FILENAME);
        
        try {
            ObjectOutputStream oos;
            FileOutputStream fos;
            
            if(predefHorarios.exists()) {
                predefHorarios.delete();
                predefHorarios.createNewFile();
            }
            
            fos = new FileOutputStream(predefHorarios);
            oos = new ObjectOutputStream(fos);
            
            oos.writeObject(aulas);
            
            oos.close();
            fos.close();
            
        } catch (Exception ex) {
            
        }
    }
    public static void main(String[] args) {
        AulasExistentes aulas = new AulasExistentes();
        
        //TWEB
        HoraAula h = new HoraAula("Tecnologias Web", "1", "L2.1", 1);
        h.setInicio(2016, 11, 15, 9, 30);
        h.setFim(2016, 11, 15, 11, 30);
        aulas.addHora(h);
        h = new HoraAula("Tecnologias Web", "1", "Anfiteatro Guerra Pratas", 0);
        h.setInicio(2016, 11, 14, 11, 30);
        h.setFim(2016, 11, 14, 12, 30);
        aulas.addHora(h);
        h = new HoraAula("Tecnologias Web", "2", "L2.2", 1);
        h.setInicio(2016,11,15,9,30);
        h.setFim(2016,12,15,11,30);
        aulas.addHora(h);
        h = new HoraAula("Tecnologias Web", "3", "L2.1", 1);
        h.setInicio(2016,11,14,9,30);
        h.setFim(2016,11,14,11,30);
        aulas.addHora(h);
        h = new HoraAula("Tecnologias Web", "4", "L2.1", 1);
        h.setInicio(2016,11,14,15,30);
        h.setFim(2016,11,14,17,30);
        aulas.addHora(h);
        h = new HoraAula("Tecnologias Web", "2", "Anfiteatro Guerra Pratas", 0);
        h.setInicio(2016,11,15,12,30);
        h.setFim(2016,11,15,13,30);
        aulas.addHora(h);
//            aulas.addHora("Tecnologias Web", "P", "L2.1", 5, "16/12/2016 13:30", "16/12/2016 15:30");
//            aulas.addHora("Tecnologias Web", "P", "L2.1", 6, "15/12/2016 14:30", "15/12/2016 16:30");
//            aulas.addHora("Tecnologias Web", "P", "L2.1", 7, "12/12/2016 16:00", "12/12/2016 18:00");
//            aulas.addHora("Tecnologias Web", "T", "Anfiteatro Guerra Pratas", 2, "15/12/2016 12:30", "15/12/2016 13:30");
//            aulas.addHora("Tecnologias Web", "P", "L2.1", 8, "12/12/2016 11:00", "12/12/2016 13:00");
//            aulas.addHora("Tecnologias Web", "P", "L2.2", 9, "14/12/2016 09:30", "14/12/2016 11:30");
//            aulas.addHora("Tecnologias Web", "P", "L2.1", 10, "15/12/2016 16:30", "15/12/2016 18:30");
//            aulas.addHora("Tecnologias Web", "P", "L2.1", 11, "16/12/2016 09:30", "16/12/2016 11:30");
//            
        //IP
        h = new HoraAula("Introdução à Programação", "1", "L1.7", 1);
        h.setInicio(2016, 11, 14, 15, 30);
        h.setFim(2016, 11, 14, 18, 30);
        aulas.addHora(h);
        h = new HoraAula("Introdução à Programação", "1", "Anfiteatro Guerra Pratas", 0);
        h.setInicio(2016, 11, 15, 13, 30);
        h.setFim(2016, 11, 15, 14, 30);
        aulas.addHora(h);
        h = new HoraAula("Introdução à Programação", "1", "Anfiteatro Guerra Pratas", 0);
        h.setInicio(2016, 11, 12, 12, 0);
        h.setFim(2016, 11, 12, 13, 0);
        aulas.addHora(h);
        h = new HoraAula("Introdução à Programação", "2", "Anfiteatro Leonor Gouveia", 0);
        h.setInicio(2016, 11, 13, 12, 0);
        h.setFim(2016, 11, 13, 13, 0);
        aulas.addHora(h);
        h = new HoraAula("Introdução à Programação", "2", "Anfiteatro Leonor Gouveia", 0);
        h.setInicio(2016, 11, 16, 12, 30);
        h.setFim(2016, 11, 16, 13, 30);
        aulas.addHora(h);
        h = new HoraAula("Introdução à Programação", "2", "L1.3", 1);
        h.setInicio(2016, 11, 15, 14, 30);
        h.setFim(2016, 11, 15, 17, 30);
        aulas.addHora(h);
        h = new HoraAula("Introdução à Programação", "3", "L1.8", 1);
        h.setInicio(2016, 11, 13, 9, 30);
        h.setFim(2016, 11, 13, 12, 30);
        aulas.addHora(h);
        h = new HoraAula("Introdução à Programação", "4", "L1.2", 1);
        h.setInicio(2016, 11, 15, 14, 30);
        h.setFim(2016, 11, 15, 17, 30);
        aulas.addHora(h);

        //SD
        h = new HoraAula("Sistemas Digitais", "1", "L1.1", 1);
        h.setInicio(2016, 11, 13, 10, 30);
        h.setFim(2016, 11, 13, 12, 30);
        aulas.addHora(h);
        h = new HoraAula("Sistemas Digitais", "1", "Anfiteatro Guerra Pratas", 0);
        h.setInicio(2016, 11, 14, 12, 30);
        h.setFim(2016, 11, 14, 13, 30);
        aulas.addHora(h);
        h = new HoraAula("Sistemas Digitais", "1", "Anfiteatro Guerra Pratas", 0);
        h.setInicio(2016, 11, 15, 11, 30);
        h.setFim(2016, 11, 15, 12, 30);
        aulas.addHora(h);
        h = new HoraAula("Sistemas Digitais", "2", "L1.1", 1);
        h.setInicio(2016, 11, 14, 9, 30);
        h.setFim(2016, 11, 14, 11, 30);
        aulas.addHora(h);
        h = new HoraAula("Sistemas Digitais", "3", "L1.1", 1);
        h.setInicio(2016, 11, 13, 15, 30);
        h.setFim(2016, 11, 13, 17, 30);
        aulas.addHora(h);
        h = new HoraAula("Sistemas Digitais", "4", "L1.1", 1);
        h.setInicio(2016, 11, 12, 14, 0);
        h.setFim(2016, 11, 12, 16, 0);
        aulas.addHora(h);
        h = new HoraAula("Sistemas Digitais", "2", "Anfiteatro Guerra Pratas", 0);
        h.setInicio(2016, 11, 15, 15, 30);
        h.setFim(2016, 11, 15, 14, 30);
        aulas.addHora(h);
        h = new HoraAula("Sistemas Digitais", "2", "Anfiteatro Guerra Pratas", 0);
        h.setInicio(2016, 11, 16, 11, 30);
        h.setFim(2016, 11, 16, 12, 30);
        aulas.addHora(h);
        
            //AL
        h = new HoraAula("Álgebra Linear", "1", "Anfiteatro Leonor Gouveia", 2);
        h.setInicio(2016, 11, 12, 16, 0);
        h.setFim(2016, 11, 12, 18, 0);
        aulas.addHora(h);
        h = new HoraAula("Álgebra Linear", "1", "Anfiteatro Guerra Pratas", 0);
        h.setInicio(2016, 11, 13, 13, 30);
        h.setFim(2016, 11, 13, 15, 30);
        aulas.addHora(h);
        h = new HoraAula("Álgebra Linear", "2", "Anfiteatro Leonor Gouveia", 2);
        h.setInicio(2016, 11, 14, 9, 30);
        h.setFim(2016, 11, 14, 11, 30);
        aulas.addHora(h);
        h = new HoraAula("Álgebra Linear", "1", "Anfiteatro Guerra Pratas", 0);
        h.setInicio(2016, 11, 13, 15, 30);
        h.setFim(2016, 11, 13, 17, 30);
        aulas.addHora(h);
        h = new HoraAula("Álgebra Linear", "3", "Anfiteatro Leonor Gouveia", 2);
        h.setInicio(2016, 11, 16, 9, 30);
        h.setFim(2016, 11, 16, 11, 30);
        aulas.addHora(h);
        h = new HoraAula("Álgebra Linear", "4", "Anfiteatro Leonor Gouveia", 2);
        h.setInicio(2016, 11, 12, 10, 30);
        h.setFim(2016, 11, 12, 12, 30);
        aulas.addHora(h);
        
           //G
        h = new HoraAula("Gestão", "1", "Anfiteatro Guerra Pratas", 0);
        h.setInicio(2016, 11, 14, 14, 30);
        h.setFim(2016, 11, 14, 16, 30);
        aulas.addHora(h);
        h = new HoraAula("Gestão", "1", "A1.2", 1);
        h.setInicio(2016, 11, 16, 13, 30);
        h.setFim(2016, 11, 16, 15, 30);
        aulas.addHora(h);
        h = new HoraAula("Gestão", "2", "A1.2", 1);
        h.setInicio(2016, 11, 16, 10, 30);
        h.setFim(2016, 11, 16, 12, 30);
        aulas.addHora(h);
        h = new HoraAula("Gestão", "3", "A1.1", 1);
        h.setInicio(2016, 11, 15, 16, 30);
        h.setFim(2016, 11, 15, 18, 30);
        aulas.addHora(h);
        h = new HoraAula("Gestão", "4", "A1.3", 1);
        h.setInicio(2016, 11, 15, 10, 30);
        h.setFim(2016, 11, 15, 12, 30);
        aulas.addHora(h);
//            
//            //AMI
        h = new HoraAula("Análise Matemática I", "1", "Anfiteatro Leonor Gouveia", 0);
        h.setInicio(2016, 11, 12, 10, 0);
        h.setFim(2016, 11, 12, 12, 0);
        aulas.addHora(h);
        h = new HoraAula("Análise Matemática I", "1", "G1_109", 1);
        h.setInicio(2016, 11, 16, 11, 30);
        h.setFim(2016, 11, 16, 12, 30);
        aulas.addHora(h);
        h = new HoraAula("Análise Matemática I", "1", "G1_109", 2);
        h.setInicio(2016, 11, 16, 9, 30);
        h.setFim(2016, 11, 16, 11, 30);
        aulas.addHora(h);
        h = new HoraAula("Análise Matemática I", "2", "G1_109", 1);
        h.setInicio(2016, 11, 13, 11, 30);
        h.setFim(2016, 11, 13, 12, 30);
        aulas.addHora(h);
        h = new HoraAula("Análise Matemática I", "2", "G1_109", 2);
        h.setInicio(2016, 11, 13, 9, 30);
        h.setFim(2016, 11, 13, 11, 30);
        aulas.addHora(h);
        h = new HoraAula("Análise Matemática I", "2", "Anfiteatro Leonor Gouveia", 0);
        h.setInicio(2016, 11, 12, 9, 30);
        h.setFim(2016, 11, 12, 11, 30);
        aulas.addHora(h);
        h = new HoraAula("Análise Matemática I", "3", "G1_109", 1);
        h.setInicio(2016, 11, 14, 11, 30);
        h.setFim(2016, 11, 14, 12, 30);
        aulas.addHora(h);
        h = new HoraAula("Análise Matemática I", "3", "G1_109", 2);
        h.setInicio(2016, 11, 14, 9, 30);
        h.setFim(2016, 11, 14, 11, 30);
        aulas.addHora(h);
        h = new HoraAula("Análise Matemática I", "4", "G1_109", 1);
        h.setInicio(2016, 11, 14, 16, 30);
        h.setFim(2016, 11, 14, 17, 30);
        aulas.addHora(h);
        h = new HoraAula("Análise Matemática I", "4", "G1_109", 2);
        h.setInicio(2016, 11, 14, 14, 30);
        h.setFim(2016, 11, 14, 16, 30);
        aulas.addHora(h);
        
        
        guardaFicheiro(aulas);
        String NOME_FICHEIRO_HORARIOS = "HORARIOS";
        File horarios = new File(NOME_FICHEIRO_HORARIOS);
        
        //se ficheiro existe, ler calendário previamente guardado
        if (horarios.exists()) {
            try {
                FileInputStream fis = new FileInputStream(horarios);
                ObjectInputStream ois = new ObjectInputStream(fis);
                
                aulas = (AulasExistentes) ois.readObject();
                if(aulas != null) {
                    System.out.println("O ficheiro de turmas foi carregado com sucesso.");
                }
                
                ois.close();
                fis.close();
            } catch (Exception ex) {
                System.err.println(ex.toString());
            }
        }
        for(HoraAula c : aulas.getAulas())
            System.out.println(c.getUc());
        
        System.out.println("Sucesso");
    }
    
}
