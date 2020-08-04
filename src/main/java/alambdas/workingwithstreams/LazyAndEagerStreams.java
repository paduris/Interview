package alambdas.workingwithstreams;

import java.util.List;
import java.util.stream.Stream;

import alambdas.domain.Movie;
import alambdas.util.MovieUtil;

/**
 * This class demonstrates the lazy and eager characteristics of streams
 * 
 * @author mkonda
 *
 */
public class LazyAndEagerStreams {
	List<Movie> movies = MovieUtil.createMovies();

	/**
	 * Lazy intermediate operations
	 */
	private void lazyIntermediateOperator() {
		
		// The filter is never executed 
		Stream<Movie> movieStream = movies
		  .stream()
		  .filter(m -> {
			 System.out.println("Lazy operation");
			 return m.isClassic();
		 }).limit(2);
		
		// Unless we add a terminal operator - uncomment and rerun
		// movieStream.forEach(System.out::println);
	}
	/**
	 *  Eager terminal operations
	 */
	private void eagerTerminalOperator() {
		movies
			.stream()
			.filter(m -> {
				System.out.println("Filtering");
				return m.isClassic();
			})
			.map(s -> {
				System.out.println("Mapping");
				return s;
			})
			.forEach(System.out::println);
//			.collect(Collectors.toList());
			
	}

	public static void main(String[] args) {
//		new LazyAndEagerStreams().lazyIntermediateOperator();
		new LazyAndEagerStreams().eagerTerminalOperator();
	}

}
