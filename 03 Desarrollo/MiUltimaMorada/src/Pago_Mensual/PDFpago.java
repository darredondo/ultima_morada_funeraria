/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pago_Mensual;

import Commons.PdfDocumento;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

/**
 *
 * @author JAVIE
 */
public class PDFpago extends PdfDocumento{
    
    public void generarPdfPago(String folio) throws IOException{
        //No mover
        page = new PDPage(PDRectangle.LETTER);
        document.addPage(page);
        this.contentStream=new PDPageContentStream(document, page);
        
        //Aqui indicamos el contenido
        
        this.agregarTexto("Funeraria Ultima Morada de S.A de C.V ", 150, 740, 16, PDType1Font.COURIER_BOLD_OBLIQUE);
        this.agregarTexto("Numero de Folio: "+folio, 60, 720, 16, PDType1Font.TIMES_ITALIC);
        this.agregarTexto("Gracias por usar nuestros servicios", 150, 600, 16, PDType1Font.TIMES_ITALIC);
        
        
        
        
        //No mover
        this.contentStream.close();
        document.save("pago.pdf");
        document.close();
        
        this.mostrarPDF("pago.pdf");
    }
}
