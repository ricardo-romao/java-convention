package br.com.ciandt.gian73.service;

/**
 * Classe comet�rio de servi�o
 * @author giancarloc
 *
 */
public class ComentarioService {

	private final static String Comentario_Removido = new String("Coment�rio removido!"); 
/**
 * Metodo construtor	
 */
public ComentarioService() {}
	/**
	 * Verifica se o coment�rio � nulo
	 * @param comentario - {@link String}
	 * @return Verdadeiro ou Falso( V ou F )
	 */
	public Boolean Adicionarlike (String comentario) 
	{
		// O if verifica se � diferente de nulo e retorna V ou F
		if(comentario != null){
			return Boolean.TRUE;
		}
		
		return Boolean.FALSE;
		
	}
	/**
	 * M�todo remo��o de coment�rio
	 * @return coment�rio removido
	 */
	public String remover(){
		return Comentario_Removido;		
	}
}
