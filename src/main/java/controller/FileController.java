package controller;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/images")
public class FileController {
	
	// Conseguir el path relativo al current project luego
	//root path for image files
	private String FILE_PATH_ROOT = "C:/Users/nicol/OneDrive/Documents/frontend projects/lpa-example/src/assets/imagenes de muestra/";
	@CrossOrigin(origins = "http://localhost:4200") // param port
	@GetMapping("/{filename}")
    public ResponseEntity<byte[]> getImage(@PathVariable("filename") String filename) {
        byte[] image = new byte[0];
        try {
        	File file = new File(FILE_PATH_ROOT+filename);
        	image = FileUtils.readFileToByteArray(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok().contentType(MediaType.IMAGE_PNG).body(image); // Por ahora uso solo PNG
        //return ResponseEntity.ok().body("bien!");
    }
    
    @GetMapping("prueba/{filename}")
    @CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<String> create(@PathVariable("filename") String filename) {
    	System.out.println("Estoy aca");
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(filename);
	}
	

}
