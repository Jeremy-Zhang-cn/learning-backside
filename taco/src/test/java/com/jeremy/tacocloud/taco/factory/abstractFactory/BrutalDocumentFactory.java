package com.jeremy.tacocloud.taco.factory.abstractFactory;

/**
 * @author Zhang Dingjie
 * @date 2020/11/27
 * @Description
 */
public class BrutalDocumentFactory extends AbstractDocumentFactory {
	@Override
	public DocumentHtml createHtml() {
		return new DocumentHtml() {
			@Override
			public void transfer2Html() {
				System.out.println("documentHtml manufactured by brutal factory...");
			}
		};
	}

	@Override
	public DocumentPdf createPdf() {
		return new DocumentPdf() {
			@Override
			public void transfer2Pdf() {
				System.out.println("documentPdf manufactured by brutal factory...");
			}
		};
	}
}
