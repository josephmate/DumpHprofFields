java -agentlib:jdwp=transport=dt_socket,server=y,address=8000,suspend=y -jar build/libs/DumpHprofFields-all-0.1.jar -hprof generate_hprof/heap.dump.windows.hprof -class SomethingWithFields
