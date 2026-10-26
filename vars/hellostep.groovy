def call(String name) {
    String msg = libraryResource('message.txt').trim()
    echo "${msg}, ${name}!"
}
