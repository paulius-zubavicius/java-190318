package l06_arrays_cycles;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import com.vcs.lects.l06.arrays_cycles.tasks.KaroliukaiImpl;
import com.vcs.lects.l06.arrays_cycles.tasks.KaroliukaiKasparas;
import com.vcs.lects.l06.arrays_cycles.tasks.KaroliukaiTunedImpl;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(1)
public class KaroliukaiBenchamrkTest {
	private static final char EMPTY = ' ';

	@State(Scope.Thread)
	public static class KState {
		public char[][] d = null;
		public KaroliukaiTunedImpl k1 = new KaroliukaiTunedImpl();
		public KaroliukaiImpl k2 = new KaroliukaiImpl();
		public KaroliukaiKasparas k3 = new KaroliukaiKasparas();

		@Setup(Level.Trial)
		public void doSetup() {

			char[][] d = { { EMPTY, '0', EMPTY, '0', '0', EMPTY, '0', EMPTY, '0', '0' },
					{ '0', EMPTY, '0', '0', '0', '0', EMPTY, '0', '0', '0' },
					{ '0', EMPTY, EMPTY, '0', EMPTY, '0', EMPTY, EMPTY, '0', EMPTY },
					{ EMPTY, EMPTY, '0', EMPTY, EMPTY, EMPTY, EMPTY, '0', EMPTY, EMPTY },
					{ EMPTY, '0', '0', EMPTY, EMPTY, EMPTY, '0', '0', EMPTY, EMPTY },
					{ EMPTY, '0', EMPTY, '0', '0', EMPTY, '0', EMPTY, '0', '0' },
					{ '0', EMPTY, '0', '0', '0', '0', EMPTY, '0', '0', '0' },
					{ '0', EMPTY, EMPTY, '0', EMPTY, '0', EMPTY, EMPTY, '0', EMPTY },
					{ EMPTY, EMPTY, '0', EMPTY, EMPTY, EMPTY, EMPTY, '0', EMPTY, EMPTY },
					{ EMPTY, '0', '0', EMPTY, EMPTY, EMPTY, '0', '0', EMPTY, EMPTY } };

			this.d = d;
			System.out.println("Do Setup");
		}
	}

	@Benchmark
	public void benchmark1(KState st) {
		st.k1.rotateClockwise(st.d, EMPTY, 10000);
	}

	@Benchmark
	public void benchmark2(KState st) {
		st.k2.rotateClockwise(st.d, EMPTY, 10000);
	}
	
	@Benchmark
	public void benchmark3(KState st) {
		st.k3.rotateClockwise(st.d, EMPTY, 10000);
	}
}
