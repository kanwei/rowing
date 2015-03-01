(ns rowing.pdf
  (:import [org.apache.pdfbox.pdmodel PDDocument]
         [org.apache.pdfbox.util PDFTextStripper]))

(defn text-of-pdf
  [url]
  (with-open [pd (PDDocument/load (java.net.URL. url))]
    (let [stripper (PDFTextStripper.)]
    (.getText stripper pd))))


(text-of-pdf "http://www.worldrowing.com/assets/pdfs/WCH_2014/ROM122102_MGPS.pdf")
