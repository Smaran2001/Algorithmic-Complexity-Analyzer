# Algorithmic Complexity Analyzer

A Java-based benchmarking tool designed to visually demonstrate and compare execution time performance between $O(N)$ (Linear Time) and $O(N^2)$ (Quadratic Time) algorithmic complexities using dynamic datasets.

## Key Features
- **Performance Benchmarking**: Compares execution speed between Linear Search and Quadratic Duplicate Detection.
- **Dynamic Dataset Generation**: Randomly generates large-scale integer arrays (50,000 elements) for accurate stress testing.
- **Precision Timing**: Utilizes Java's `System.nanoTime()` converted to milliseconds for high-accuracy runtime analysis.

## Tech Stack
- **Language**: Java (JDK 26)
- **Concepts**: Algorithms, Time Complexity Analysis, Benchmarking
- **Environment**: Visual Studio Code / Windows Terminal

## Project Structure

```text
Algorithmic-Complexity-Analyzer/
└── AlgorithmicComplexityAnalyzer.java   # Main benchmarking and runtime logic
```
## Future Improvements
- **Algorithmic Optimizations**: Implement `$O(N \log N)$` sorting-based and `$O(N)$` Hash-based duplicate detection algorithms to compare with quadratic runtime.
- **Microbenchmarking**: Integrate **JMH (Java Microbenchmark Harness)** to reduce JVM warm-up bias and improve metric accuracy.
- **Visual Charting**: Add a lightweight UI or export runtime metrics to CSV/JSON to plot scaling charts automatically.
