package br.com.qualeaplaca.dto;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemHeaders;


public class VideoDto implements Serializable,FileItem{

	private static final long serialVersionUID = -132286938893425662L;
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public FileItemHeaders getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setHeaders(FileItemHeaders headers) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public InputStream getInputStream() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getContentType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isInMemory() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public byte[] get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getString(String encoding) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void write(File file) throws Exception {
		
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getFieldName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFieldName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isFormField() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setFormField(boolean state) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OutputStream getOutputStream() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
}
