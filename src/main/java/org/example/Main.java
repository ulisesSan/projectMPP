package org.example;

import org.mpxj.MPXJException;
import org.mpxj.ProjectFile;
import org.mpxj.Resource;
import org.mpxj.mpx.MPXWriter;
import org.mpxj.reader.ProjectReader;
import org.mpxj.reader.UniversalProjectReader;
import org.mpxj.writer.ProjectWriter;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) throws MPXJException, IOException {
        ProjectWriter writer = new MPXWriter();
        ProjectReader reader = new UniversalProjectReader();
        ProjectFile project = reader.read("/home/ulises/Descargas/571844_SOLICITUD DE " +
                "SEPARACION DE FLUJO PREPAGO Y POSPAGO EN SUSPENSION REST.mpp");
        writer.write(project,"/home/ulises/Descargas/de_mpx.mpx");

        //writer.


        project.setBaseline(project, 12);

        for (Resource resource : project.getResources())
        {
            System.out.println("Resource: " + resource.getName()
                    + " (Unique ID=" + resource.getUniqueID() + ")");
        }

    }
}