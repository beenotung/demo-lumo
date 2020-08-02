(require '[lumo.build.api :as b])
(b/build "src-client"
         {
          :main          'client.app
          :output-to     "out/main.js"
          ;:target        :nodejs
          :target        :browser
          ;:optimizations :advanced
          })
