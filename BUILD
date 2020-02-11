cc_library(
    name = "main-jni-lib",
    srcs = [
        "Main.cc",
        "Main.h",
    ],
    hdrs = [
        "@bazel_tools//tools/jdk:jni_header",
        "@bazel_tools//tools/jdk:jni_md_header-linux",
    ],
    includes = [
        "external/bazel_tools/tools/jdk/include",
        "external/bazel_tools/tools/jdk/include/linux",
    ],
    alwayslink = True,
)

cc_binary(
    name = "libmain-jni.so",
    deps = [ ":main-jni-lib" ],
    linkshared = True,
)

java_binary(
    name = "Main",
    srcs = [ "Main.java" ],
    main_class = "Main",
    data = [ ":libmain-jni.so" ],
    jvm_flags = [ "-Djava.library.path=." ],
)
