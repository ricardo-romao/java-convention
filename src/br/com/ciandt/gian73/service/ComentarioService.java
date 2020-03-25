package br.com.ciandt.gian73.service;

/**
 * Classe cometário de serviço
 * @author giancarloc
 *
 */
public class ComentarioService {

	private final static String Comentario_Removido = new String("Comentário removido!"); 
/**
 * Metodo construtor	
 */
public ComentarioService() {}
	/**
	 * Verifica se o comentário é nulo
	 * @param comentario - {@link String}
	 * @return Verdadeiro ou Falso( V ou F )
	 */
	public Boolean Adicionarlike (String comentario) 
	{
		// O if verifica se é diferente de nulo e retorna V ou F
		if(comentario != null){
			return Boolean.TRUE;
		}
		
		return Boolean.FALSE;
		
	}
	/**
	 * Método remoção de comentário
	 * @return comentário removido
	 */
	public String remover(){
		return Comentario_Removido;		
	}
}
