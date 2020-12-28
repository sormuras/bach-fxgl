import com.github.sormuras.bach.project.Feature;
import com.github.sormuras.bach.project.ProjectInfo;
import com.github.sormuras.bach.project.ProjectInfo.Link;

@ProjectInfo(
    name = "bach-fxgl",
    features = Feature.GENERATE_CUSTOM_RUNTIME_IMAGE,
    links = {
        @Link(
            module = "com.fasterxml.jackson.annotation",
            to = "https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.11.2/jackson-annotations-2.11.2.jar"),
        @Link(
            module = "com.fasterxml.jackson.databind",
            to = "https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.11.2/jackson-databind-2.11.2.jar"),
    }
)
module build {
  requires com.github.sormuras.bach;
  provides com.github.sormuras.bach.BuildProgram with build.Program;
}
