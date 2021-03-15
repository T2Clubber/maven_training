package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SampleTest {


    @Test
    void add_behaves_as_expected() {
        int result = new Sample().op(Sample.Operation.ADD,1,3);

        Assertions.assertThat(result).isEqualTo(4);
    }

    @Test
    void mul_behaves_as_expected() {
        int result = new Sample().op(Sample.Operation.MULT,1,3);

        Assertions.assertThat(result).isEqualTo(3);
    }


}
