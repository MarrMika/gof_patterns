package behavioural.strategy.enumStrategy;

public enum Math implements Strategy{
    ADD{
        @Override
        public int execute(int a, int b) {
            return a+b;
        }
    },

    MULTIPLY{
        @Override
        public int execute(int a, int b) {
            return a*b;
        }
    },

    SUBTRACT{
        @Override
        public int execute(int a, int b) {
            return a-b;
        }
    }
}
